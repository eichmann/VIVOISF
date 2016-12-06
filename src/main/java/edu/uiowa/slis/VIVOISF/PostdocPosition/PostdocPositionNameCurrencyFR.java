package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameCurrencyFRIterator thePostdocPosition = (PostdocPositionNameCurrencyFRIterator)findAncestorWithClass(this, PostdocPositionNameCurrencyFRIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

