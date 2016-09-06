package edu.uiowa.slis.VIVOISF.AwardedDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardedDegreeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardedDegreeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardedDegreeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AwardedDegree theAwardedDegree = (AwardedDegree)findAncestorWithClass(this, AwardedDegree.class);
			if (!theAwardedDegree.commitNeeded) {
				pageContext.getOut().print(theAwardedDegree.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AwardedDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardedDegree for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AwardedDegree theAwardedDegree = (AwardedDegree)findAncestorWithClass(this, AwardedDegree.class);
			return theAwardedDegree.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AwardedDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardedDegree for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AwardedDegree theAwardedDegree = (AwardedDegree)findAncestorWithClass(this, AwardedDegree.class);
			theAwardedDegree.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AwardedDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardedDegree for label tag ");
		}
	}
}

