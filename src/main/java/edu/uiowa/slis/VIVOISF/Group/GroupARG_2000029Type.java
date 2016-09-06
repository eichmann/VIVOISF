package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupARG_2000029Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupARG_2000029Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupARG_2000029Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupARG_2000029Iterator theGroupARG_2000029Iterator = (GroupARG_2000029Iterator)findAncestorWithClass(this, GroupARG_2000029Iterator.class);
			pageContext.getOut().print(theGroupARG_2000029Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for ARG_2000029 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for ARG_2000029 tag ");
		}
		return SKIP_BODY;
	}
}

