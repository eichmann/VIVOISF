package edu.uiowa.slis.VIVOISF.AsymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AsymmetricPropertyTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AsymmetricPropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(AsymmetricPropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AsymmetricPropertyTheTypeIterator theAsymmetricProperty = (AsymmetricPropertyTheTypeIterator)findAncestorWithClass(this, AsymmetricPropertyTheTypeIterator.class);
			pageContext.getOut().print(theAsymmetricProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing AsymmetricProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing AsymmetricProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

