package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmVolumeIterator theFilm = (FilmVolumeIterator)findAncestorWithClass(this, FilmVolumeIterator.class);
			pageContext.getOut().print(theFilm.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for volume tag ");
		}
		return SKIP_BODY;
	}
}

