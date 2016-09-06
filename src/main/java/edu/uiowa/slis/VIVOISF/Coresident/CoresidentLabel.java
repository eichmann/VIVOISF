package edu.uiowa.slis.VIVOISF.Coresident;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoresidentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoresidentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CoresidentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Coresident theCoresident = (Coresident)findAncestorWithClass(this, Coresident.class);
			if (!theCoresident.commitNeeded) {
				pageContext.getOut().print(theCoresident.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Coresident for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coresident for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Coresident theCoresident = (Coresident)findAncestorWithClass(this, Coresident.class);
			return theCoresident.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Coresident for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coresident for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Coresident theCoresident = (Coresident)findAncestorWithClass(this, Coresident.class);
			theCoresident.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Coresident for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coresident for label tag ");
		}
	}
}

