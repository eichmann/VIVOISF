package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(groupARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupARG_2000028Iterator thegroupARG_2000028Iterator = (groupARG_2000028Iterator)findAncestorWithClass(this, groupARG_2000028Iterator.class);
			pageContext.getOut().print(thegroupARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

