package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperRO_0000056Iterator theNewspaperRO_0000056Iterator = (NewspaperRO_0000056Iterator)findAncestorWithClass(this, NewspaperRO_0000056Iterator.class);
			pageContext.getOut().print(theNewspaperRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

