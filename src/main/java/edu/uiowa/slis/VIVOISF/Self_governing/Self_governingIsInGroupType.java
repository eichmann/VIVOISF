package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingIsInGroupType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingIsInGroupType currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingIsInGroupType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Self_governingIsInGroupIterator theSelf_governingIsInGroupIterator = (Self_governingIsInGroupIterator)findAncestorWithClass(this, Self_governingIsInGroupIterator.class);
			pageContext.getOut().print(theSelf_governingIsInGroupIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}

