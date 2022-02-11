module.exports = (req, res, next) => {
    res.header('Content-Range', 'survey 0-20/20')
    next()
}