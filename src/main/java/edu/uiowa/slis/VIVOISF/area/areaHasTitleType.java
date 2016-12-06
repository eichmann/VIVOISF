package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasTitleIterator theareaHasTitleIterator = (areaHasTitleIterator)findAncestorWithClass(this, areaHasTitleIterator.class);
			pageContext.getOut().print(theareaHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

