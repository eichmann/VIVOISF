package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			if (!theterritory.commitNeeded) {
				pageContext.getOut().print(theterritory.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing territory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			return theterritory.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing territory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			theterritory.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing territory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for abbreviation tag ");
		}
	}
}

