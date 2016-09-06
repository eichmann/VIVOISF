package edu.uiowa.slis.VIVOISF.Female;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FemaleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FemaleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FemaleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Female theFemale = (Female)findAncestorWithClass(this, Female.class);
			if (!theFemale.commitNeeded) {
				pageContext.getOut().print(theFemale.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Female for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Female for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Female theFemale = (Female)findAncestorWithClass(this, Female.class);
			return theFemale.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Female for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Female for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Female theFemale = (Female)findAncestorWithClass(this, Female.class);
			theFemale.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Female for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Female for label tag ");
		}
	}
}

