package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterDistributorIterator theLetterDistributorIterator = (LetterDistributorIterator)findAncestorWithClass(this, LetterDistributorIterator.class);
			pageContext.getOut().print(theLetterDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for distributor tag ");
		}
		return SKIP_BODY;
	}
}

