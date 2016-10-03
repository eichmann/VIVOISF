package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Isbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Isbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Isbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013Isbn13Iterator theIAO_0000013 = (IAO_0000013Isbn13Iterator)findAncestorWithClass(this, IAO_0000013Isbn13Iterator.class);
			pageContext.getOut().print(theIAO_0000013.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

