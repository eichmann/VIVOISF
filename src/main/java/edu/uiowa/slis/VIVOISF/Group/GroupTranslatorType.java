package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupTranslatorIterator theGroupTranslatorIterator = (GroupTranslatorIterator)findAncestorWithClass(this, GroupTranslatorIterator.class);
			pageContext.getOut().print(theGroupTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for translator tag ");
		}
		return SKIP_BODY;
	}
}

