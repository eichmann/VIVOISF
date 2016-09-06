package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupTranslatorOfIterator theGroupTranslatorOfIterator = (GroupTranslatorOfIterator)findAncestorWithClass(this, GroupTranslatorOfIterator.class);
			pageContext.getOut().print(theGroupTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

