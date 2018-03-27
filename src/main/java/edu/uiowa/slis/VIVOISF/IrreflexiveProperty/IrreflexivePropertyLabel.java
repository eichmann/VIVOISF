package edu.uiowa.slis.VIVOISF.IrreflexiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IrreflexivePropertyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IrreflexivePropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IrreflexivePropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IrreflexiveProperty theIrreflexiveProperty = (IrreflexiveProperty)findAncestorWithClass(this, IrreflexiveProperty.class);
			if (!theIrreflexiveProperty.commitNeeded) {
				pageContext.getOut().print(theIrreflexiveProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IrreflexiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IrreflexiveProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			IrreflexiveProperty theIrreflexiveProperty = (IrreflexiveProperty)findAncestorWithClass(this, IrreflexiveProperty.class);
			return theIrreflexiveProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing IrreflexiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IrreflexiveProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			IrreflexiveProperty theIrreflexiveProperty = (IrreflexiveProperty)findAncestorWithClass(this, IrreflexiveProperty.class);
			theIrreflexiveProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing IrreflexiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IrreflexiveProperty for label tag ");
		}
	}
}

