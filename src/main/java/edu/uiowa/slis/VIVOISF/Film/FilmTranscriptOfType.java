package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmTranscriptOfIterator theFilmTranscriptOfIterator = (FilmTranscriptOfIterator)findAncestorWithClass(this, FilmTranscriptOfIterator.class);
			pageContext.getOut().print(theFilmTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

