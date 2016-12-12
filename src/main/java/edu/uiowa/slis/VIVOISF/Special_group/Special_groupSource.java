package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupSource currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupSourceIterator theSpecial_group = (Special_groupSourceIterator)findAncestorWithClass(this, Special_groupSourceIterator.class);
			pageContext.getOut().print(theSpecial_group.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for source tag ");
		}
		return SKIP_BODY;
	}
}

