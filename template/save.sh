#!/bin/bash


last_command=$(history |tail -2 | cut -b 7-| sed '$d')


cat <<EOF > get_flag.sh
#!/bin/bash

${last_command}
EOF

chmod +x get_flag.sh

./get_flag.sh > flag.md
