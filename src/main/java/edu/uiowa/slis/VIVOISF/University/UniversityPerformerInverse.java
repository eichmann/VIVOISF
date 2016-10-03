package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityPerformerInverseIterator theUniversityPerformerInverseIterator = (UniversityPerformerInverseIterator)findAncestorWithClass(this, UniversityPerformerInverseIterator.class);
			pageContext.getOut().print(theUniversityPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for performer tag ");
		}
		return SKIP_BODY;
	}
}

