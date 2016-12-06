package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasTitleIterator thespecial_groupHasTitleIterator = (special_groupHasTitleIterator)findAncestorWithClass(this, special_groupHasTitleIterator.class);
			pageContext.getOut().print(thespecial_groupHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

