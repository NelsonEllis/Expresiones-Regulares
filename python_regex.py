#!/usr/bin/python3

import re


pattern = re.compile(r'^([\d]{4,4})\-\d\d\-\d\d,(.+),(.+),(\d+),(\d+),.*$')

f = open('./results.csv', 'r')

forlinein f:
    res = re.match(pattern, line)
    if res:
        total = int(res.group(4)) + int(res.group(5))
        iftotal > 15:
            print(
                f'goles: {total}, {res.group(1)} '
                f'{res.group(2)}, {res.group(3)} '
                f'[{res.group(4)}, {res.group(5)}]'
            )

f.close()