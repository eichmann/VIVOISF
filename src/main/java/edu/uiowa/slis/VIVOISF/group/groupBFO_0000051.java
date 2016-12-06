package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(groupBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupBFO_0000051Iterator thegroupBFO_0000051Iterator = (groupBFO_0000051Iterator)findAncestorWithClass(this, groupBFO_0000051Iterator.class);
			pageContext.getOut().print(thegroupBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing group for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

