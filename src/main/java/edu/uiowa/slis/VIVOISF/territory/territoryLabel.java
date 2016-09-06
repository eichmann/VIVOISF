package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			if (!theterritory.commitNeeded) {
				pageContext.getOut().print(theterritory.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing territory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			return theterritory.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing territory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			theterritory.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing territory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for label tag ");
		}
	}
}

