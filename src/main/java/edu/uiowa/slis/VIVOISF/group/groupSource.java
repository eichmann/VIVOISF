package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSource currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupSourceIterator thegroup = (groupSourceIterator)findAncestorWithClass(this, groupSourceIterator.class);
			pageContext.getOut().print(thegroup.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing group for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for source tag ");
		}
		return SKIP_BODY;
	}
}

