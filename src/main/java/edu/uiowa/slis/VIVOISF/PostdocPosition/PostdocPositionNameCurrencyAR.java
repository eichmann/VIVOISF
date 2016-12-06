package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameCurrencyARIterator thePostdocPosition = (PostdocPositionNameCurrencyARIterator)findAncestorWithClass(this, PostdocPositionNameCurrencyARIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

