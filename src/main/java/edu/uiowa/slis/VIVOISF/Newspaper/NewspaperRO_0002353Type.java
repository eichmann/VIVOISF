package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperRO_0002353Iterator theNewspaperRO_0002353Iterator = (NewspaperRO_0002353Iterator)findAncestorWithClass(this, NewspaperRO_0002353Iterator.class);
			pageContext.getOut().print(theNewspaperRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

