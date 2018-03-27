package edu.uiowa.slis.VIVOISF.AsymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AsymmetricPropertyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AsymmetricPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AsymmetricPropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AsymmetricProperty theAsymmetricProperty = (AsymmetricProperty)findAncestorWithClass(this, AsymmetricProperty.class);
			if (!theAsymmetricProperty.commitNeeded) {
				pageContext.getOut().print(theAsymmetricProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AsymmetricProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AsymmetricProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AsymmetricProperty theAsymmetricProperty = (AsymmetricProperty)findAncestorWithClass(this, AsymmetricProperty.class);
			return theAsymmetricProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AsymmetricProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AsymmetricProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AsymmetricProperty theAsymmetricProperty = (AsymmetricProperty)findAncestorWithClass(this, AsymmetricProperty.class);
			theAsymmetricProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AsymmetricProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AsymmetricProperty for label tag ");
		}
	}
}

