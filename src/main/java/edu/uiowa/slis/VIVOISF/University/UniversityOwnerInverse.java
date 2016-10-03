package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityOwnerInverseIterator theUniversityOwnerInverseIterator = (UniversityOwnerInverseIterator)findAncestorWithClass(this, UniversityOwnerInverseIterator.class);
			pageContext.getOut().print(theUniversityOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for owner tag ");
		}
		return SKIP_BODY;
	}
}

