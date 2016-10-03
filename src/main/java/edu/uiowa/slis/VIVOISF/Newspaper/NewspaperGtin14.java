package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperGtin14Iterator theNewspaper = (NewspaperGtin14Iterator)findAncestorWithClass(this, NewspaperGtin14Iterator.class);
			pageContext.getOut().print(theNewspaper.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

