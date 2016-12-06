package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameCurrencyENIterator thePostdocPosition = (PostdocPositionNameCurrencyENIterator)findAncestorWithClass(this, PostdocPositionNameCurrencyENIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

