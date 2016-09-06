package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Film theFilm = (Film)findAncestorWithClass(this, Film.class);
			if (!theFilm.commitNeeded) {
				pageContext.getOut().print(theFilm.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Film for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Film theFilm = (Film)findAncestorWithClass(this, Film.class);
			return theFilm.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Film for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Film theFilm = (Film)findAncestorWithClass(this, Film.class);
			theFilm.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Film for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for subjectURI tag ");
		}
	}
}

