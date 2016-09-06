package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceIAO_0000136Iterator theReferenceSourceIAO_0000136Iterator = (ReferenceSourceIAO_0000136Iterator)findAncestorWithClass(this, ReferenceSourceIAO_0000136Iterator.class);
			pageContext.getOut().print(theReferenceSourceIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

