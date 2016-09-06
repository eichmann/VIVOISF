package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Film theFilm = (Film)findAncestorWithClass(this, Film.class);
			if (!theFilm.commitNeeded) {
				pageContext.getOut().print(theFilm.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Film for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Film theFilm = (Film)findAncestorWithClass(this, Film.class);
			return theFilm.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Film for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Film theFilm = (Film)findAncestorWithClass(this, Film.class);
			theFilm.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Film for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for label tag ");
		}
	}
}

