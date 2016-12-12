package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupSourceCreatorIterator theSpecial_group = (Special_groupSourceCreatorIterator)findAncestorWithClass(this, Special_groupSourceCreatorIterator.class);
			pageContext.getOut().print(theSpecial_group.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

