package edu.uiowa.slis.VIVOISF.IrreflexiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IrreflexivePropertyTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IrreflexivePropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(IrreflexivePropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IrreflexivePropertyTheTypeIterator theIrreflexiveProperty = (IrreflexivePropertyTheTypeIterator)findAncestorWithClass(this, IrreflexivePropertyTheTypeIterator.class);
			pageContext.getOut().print(theIrreflexiveProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing IrreflexiveProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing IrreflexiveProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

