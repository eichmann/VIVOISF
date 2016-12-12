package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupSourceModifiedIterator theSpecial_group = (Special_groupSourceModifiedIterator)findAncestorWithClass(this, Special_groupSourceModifiedIterator.class);
			pageContext.getOut().print(theSpecial_group.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

