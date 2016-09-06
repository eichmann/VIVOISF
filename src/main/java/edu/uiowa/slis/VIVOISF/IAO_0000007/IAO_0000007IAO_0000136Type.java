package edu.uiowa.slis.VIVOISF.IAO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000007IAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000007IAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000007IAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000007IAO_0000136Iterator theIAO_0000007IAO_0000136Iterator = (IAO_0000007IAO_0000136Iterator)findAncestorWithClass(this, IAO_0000007IAO_0000136Iterator.class);
			pageContext.getOut().print(theIAO_0000007IAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000007 for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000007 for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

