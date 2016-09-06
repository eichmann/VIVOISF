package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			if (!theUniversity.commitNeeded) {
				pageContext.getOut().print(theUniversity.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing University for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			return theUniversity.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing University for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			theUniversity.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing University for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for label tag ");
		}
	}
}

