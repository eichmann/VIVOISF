package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupSource currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupSourceIterator thespecial_group = (special_groupSourceIterator)findAncestorWithClass(this, special_groupSourceIterator.class);
			pageContext.getOut().print(thespecial_group.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for source tag ");
		}
		return SKIP_BODY;
	}
}

