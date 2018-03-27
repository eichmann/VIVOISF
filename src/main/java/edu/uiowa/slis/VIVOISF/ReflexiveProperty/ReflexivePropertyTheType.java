package edu.uiowa.slis.VIVOISF.ReflexiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReflexivePropertyTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReflexivePropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReflexivePropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReflexivePropertyTheTypeIterator theReflexiveProperty = (ReflexivePropertyTheTypeIterator)findAncestorWithClass(this, ReflexivePropertyTheTypeIterator.class);
			pageContext.getOut().print(theReflexiveProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReflexiveProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReflexiveProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

