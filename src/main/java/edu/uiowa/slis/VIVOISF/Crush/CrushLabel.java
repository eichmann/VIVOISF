package edu.uiowa.slis.VIVOISF.Crush;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CrushLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CrushLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CrushLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Crush theCrush = (Crush)findAncestorWithClass(this, Crush.class);
			if (!theCrush.commitNeeded) {
				pageContext.getOut().print(theCrush.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Crush for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Crush for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Crush theCrush = (Crush)findAncestorWithClass(this, Crush.class);
			return theCrush.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Crush for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Crush for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Crush theCrush = (Crush)findAncestorWithClass(this, Crush.class);
			theCrush.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Crush for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Crush for label tag ");
		}
	}
}

