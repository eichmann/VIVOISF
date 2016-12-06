package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeDBPediaIDIterator thespecial_group = (special_groupCodeDBPediaIDIterator)findAncestorWithClass(this, special_groupCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thespecial_group.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

