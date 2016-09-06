package edu.uiowa.slis.VIVOISF.Fax;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FaxLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FaxLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FaxLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Fax theFax = (Fax)findAncestorWithClass(this, Fax.class);
			if (!theFax.commitNeeded) {
				pageContext.getOut().print(theFax.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Fax for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fax for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Fax theFax = (Fax)findAncestorWithClass(this, Fax.class);
			return theFax.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Fax for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fax for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Fax theFax = (Fax)findAncestorWithClass(this, Fax.class);
			theFax.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Fax for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fax for label tag ");
		}
	}
}

