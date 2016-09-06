package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Legislation theLegislation = (Legislation)findAncestorWithClass(this, Legislation.class);
			if (!theLegislation.commitNeeded) {
				pageContext.getOut().print(theLegislation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Legislation theLegislation = (Legislation)findAncestorWithClass(this, Legislation.class);
			return theLegislation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Legislation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Legislation theLegislation = (Legislation)findAncestorWithClass(this, Legislation.class);
			theLegislation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for label tag ");
		}
	}
}

