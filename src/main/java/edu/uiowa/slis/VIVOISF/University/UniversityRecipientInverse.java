package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityRecipientInverseIterator theUniversityRecipientInverseIterator = (UniversityRecipientInverseIterator)findAncestorWithClass(this, UniversityRecipientInverseIterator.class);
			pageContext.getOut().print(theUniversityRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for recipient tag ");
		}
		return SKIP_BODY;
	}
}

