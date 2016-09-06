package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefIAO_0000136Iterator theBriefIAO_0000136Iterator = (BriefIAO_0000136Iterator)findAncestorWithClass(this, BriefIAO_0000136Iterator.class);
			pageContext.getOut().print(theBriefIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

