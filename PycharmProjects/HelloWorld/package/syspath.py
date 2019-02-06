import os
try:
    user_paths = os.environ['PYTHONPATH'].split(os.pathsep)
    print
    user_paths
except KeyError:
    user_paths = []
