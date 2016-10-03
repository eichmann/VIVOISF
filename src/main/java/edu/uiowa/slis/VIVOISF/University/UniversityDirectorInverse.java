package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityDirectorInverseIterator theUniversityDirectorInverseIterator = (UniversityDirectorInverseIterator)findAncestorWithClass(this, UniversityDirectorInverseIterator.class);
			pageContext.getOut().print(theUniversityDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for director tag ");
		}
		return SKIP_BODY;
	}
}

