package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeDBPediaIDIterator thegroup = (groupCodeDBPediaIDIterator)findAncestorWithClass(this, groupCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thegroup.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

