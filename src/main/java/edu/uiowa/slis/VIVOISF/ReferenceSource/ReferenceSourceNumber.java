package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceNumberIterator theReferenceSource = (ReferenceSourceNumberIterator)findAncestorWithClass(this, ReferenceSourceNumberIterator.class);
			pageContext.getOut().print(theReferenceSource.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for number tag ");
		}
		return SKIP_BODY;
	}
}

