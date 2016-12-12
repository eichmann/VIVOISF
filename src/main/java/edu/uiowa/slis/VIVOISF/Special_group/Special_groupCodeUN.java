package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupCodeUNIterator theSpecial_group = (Special_groupCodeUNIterator)findAncestorWithClass(this, Special_groupCodeUNIterator.class);
			pageContext.getOut().print(theSpecial_group.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

