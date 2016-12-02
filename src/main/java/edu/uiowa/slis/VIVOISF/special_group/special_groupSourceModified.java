package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupSourceModifiedIterator thespecial_group = (special_groupSourceModifiedIterator)findAncestorWithClass(this, special_groupSourceModifiedIterator.class);
			pageContext.getOut().print(thespecial_group.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

